public class DrawGame {
    public void drawHangman(int lives, boolean isHardMode) {
        if (isHardMode) {
            drawHardHangman(lives);
        } else {
            drawEasyHangman(lives);
        }
    }

    private void drawEasyHangman(int lives) {
        switch (lives) {
            case 7:
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 6:
                System.out.println("    |----------");
                System.out.println("    |/");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 5:
                System.out.println("    |----------");
                System.out.println("    |/    O");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 4:
                System.out.println("    |----------");
                System.out.println("    |/   O");
                System.out.println("    |    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 3:
                System.out.println("    |----------");
                System.out.println("    |/   O");
                System.out.println("    |   -|");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 2:
                System.out.println("    |----------");
                System.out.println("    |/   O");
                System.out.println("    |   -|-");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 1:
                System.out.println("    |----------");
                System.out.println("    |/   O");
                System.out.println("    |   -|-");
                System.out.println("    |   /");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 0:
                System.out.println("    |----------");
                System.out.println("    |/   O");
                System.out.println("    |   -|-");
                System.out.println("    |   / \\");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
        }
    }

    private void drawHardHangman(int lives) {
        switch (lives) {
            case 6:
                System.out.println("    |----------");
                System.out.println("    |/    O");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 4:
                System.out.println("    |----------");
                System.out.println("    |/   O");
                System.out.println("    |    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 2:
                System.out.println("    |----------");
                System.out.println("    |/   O");
                System.out.println("    |   -|-");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 0:
                System.out.println("    |----------");
                System.out.println("    |/   O");
                System.out.println("    |   -|-");
                System.out.println("    |   / \\");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            default:
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
        }
    }
}