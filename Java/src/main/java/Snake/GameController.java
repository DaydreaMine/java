package Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameController implements Runnable, KeyListener {
    private final Grid grid;
    private final GameView gameView;


    boolean running;
    boolean restart = false;
    boolean pause = false;

    public GameController(Grid grid, GameView gameView) {
        this.grid = grid;
        this.gameView = gameView;
        this.running = true;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Integer keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                grid.changeDirection(Direction.UP);
                break;
            case KeyEvent.VK_DOWN:
                grid.changeDirection(Direction.DOWN);
                break;
            case KeyEvent.VK_LEFT:
                grid.changeDirection(Direction.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                grid.changeDirection(Direction.RIGHT);
                break;
            default:
        }

        // your code here：处理回车键，重新开始游戏
        if (running != true) {
            switch (keyCode) {
                case KeyEvent.VK_ENTER:
                    restart = true;
                    running = true;
                    pause = false;
                    new Thread(this).start();
                    break;
                case KeyEvent.VK_SPACE:
                    running = true;
                    pause=false;
                    new Thread(this).start();
                    break;
                default:
            }
        } else if (keyCode.equals(KeyEvent.VK_SPACE)) {
            running = false;
            pause=true;
            new Thread(this).start();
//            System.out.println(running);
        }

        switch (keyCode) {
            case KeyEvent.VK_1:
                Settings.setDefaultMoveInterval(50);
                break;
            case KeyEvent.VK_2:
                Settings.setDefaultMoveInterval(100);
                break;
            case KeyEvent.VK_3:
                Settings.setDefaultMoveInterval(200);
                break;
            case KeyEvent.VK_4:
                Settings.setDefaultMoveInterval(400);
                break;
            default:
        }
    }

    /**
     * 按一定速率自动移动贪吃蛇
     */
    public void run() {

        while (running) {
            try {
                Thread.sleep(Settings.getDefaultMoveInterval());
            } catch (InterruptedException e) {
                break;
            }
            if (restart) {
                this.grid.init();
                restart = false;
            } else {
                if (this.grid.nextRound()&&!pause){
                    running = true;
                }else{
                    running=false;
                }
            }
            this.gameView.draw();
        }
        if (!running) {
            if (pause==false){
                this.gameView.showGameOverMessage();
            }else {
                this.gameView.showGameOverMessage1();
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
