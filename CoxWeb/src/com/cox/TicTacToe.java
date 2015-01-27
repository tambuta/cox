package com.cox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TicTacToe {
    private final Map<CELL, Cell> cells = new HashMap<CELL, Cell>(9);
    private final Map<String, Path> paths = new HashMap<String, Path>(8);

    private String msg = null;

    private Path d1 = null;
    private Path d2 = null;
    private Path c1 = null;
    private Path c2 = null;
    private Path c3 = null;
    private Path r1 = null;
    private Path r2 = null;
    private Path r3 = null;
    private Path[] p00 = null;
    private Path[] p11 = null;
    private Path[] p22 = null;
    private Path[] p02 = null;
    private Path[] p20 = null;
    private Path[] p01 = null;
    private Path[] p21 = null;
    private Path[] p12 = null;
    private Path[] p10 = null;

    public void setSelection(String selection) {
        if (selection == null)
            return;

        if ("00".equals(selection)) {
            this.setC00("x");
        } else if ("01".equals(selection)) {
            this.setC01("x");
        } else if ("02".equals(selection)) {
            this.setC02("x");
        } else if ("10".equals(selection)) {
            this.setC10("x");
        } else if ("11".equals(selection)) {
            this.setC11("x");
        } else if ("12".equals(selection)) {
            this.setC12("x");
        } else if ("20".equals(selection)) {
            this.setC20("x");
        } else if ("21".equals(selection)) {
            this.setC21("x");
        } else if ("22".equals(selection)) {
            this.setC22("x");
        }
    }

    public String getC00() {
        return this.cells.get(CELL.C00).toString();
    }

    public void setC00(String c00) {
        if (this.cells.get(CELL.C00).getXO() == Cell.XO.O)
            return;
        this.play("00");
    }

    public String getC01() {
        return this.cells.get(CELL.C01).toString();
    }

    public void setC01(String c01) {
        if (this.cells.get(CELL.C01).getXO() == Cell.XO.O)
            return;
        this.play("01");
    }

    public String getC02() {
        return this.cells.get(CELL.C02).toString();
    }

    public void setC02(String c02) {
        if (this.cells.get(CELL.C02).getXO() == Cell.XO.O)
            return;
        this.play("02");
    }

    public String getC10() {
        return this.cells.get(CELL.C10).toString();
    }

    public void setC10(String c10) {
        if (this.cells.get(CELL.C10).getXO() == Cell.XO.O)
            return;
        this.play("10");
    }

    public String getC11() {
        return this.cells.get(CELL.C11).toString();
    }

    public void setC11(String c11) {
        if (this.cells.get(CELL.C11).getXO() == Cell.XO.O)
            return;
        this.play("11");
    }

    public String getC12() {
        return this.cells.get(CELL.C12).toString();
    }

    public void setC12(String c12) {
        if (this.cells.get(CELL.C12).getXO() == Cell.XO.O)
            return;
        this.play("12");
    }

    public String getC20() {
        return this.cells.get(CELL.C20).toString();
    }

    public void setC20(String c20) {
        if (this.cells.get(CELL.C20).getXO() == Cell.XO.O)
            return;
        this.play("20");
    }

    public String getC21() {
        return this.cells.get(CELL.C21).toString();
    }

    public void setC21(String c21) {
        if (this.cells.get(CELL.C21).getXO() == Cell.XO.O)
            return;
        this.play("21");
    }

    public String getC22() {
        return this.cells.get(CELL.C22).toString();
    }

    public void setC22(String c22) {
        if (this.cells.get(CELL.C22).getXO() == Cell.XO.O)
            return;
        this.play("22");
    }

    public TicTacToe() {
        cells.put(CELL.C00, new Cell(0, 0));
        cells.put(CELL.C01, new Cell(0, 1));
        cells.put(CELL.C02, new Cell(0, 2));
        cells.put(CELL.C10, new Cell(1, 0));
        cells.put(CELL.C11, new Cell(1, 1));
        cells.put(CELL.C12, new Cell(1, 2));
        cells.put(CELL.C20, new Cell(2, 0));
        cells.put(CELL.C21, new Cell(2, 1));
        cells.put(CELL.C22, new Cell(2, 2));

        d1 = new Path(new Cell[] { cells.get(CELL.C00), cells.get(CELL.C11), cells.get(CELL.C22) });
        paths.put("d1", d1);
        d2 = new Path(new Cell[] { cells.get(CELL.C02), cells.get(CELL.C11), cells.get(CELL.C20) });
        paths.put("d2", d2);
        c1 = new Path(new Cell[] { cells.get(CELL.C00), cells.get(CELL.C10), cells.get(CELL.C20) });
        paths.put("c1", c1);
        c2 = new Path(new Cell[] { cells.get(CELL.C01), cells.get(CELL.C11), cells.get(CELL.C21) });
        paths.put("c2", c2);
        c3 = new Path(new Cell[] { cells.get(CELL.C02), cells.get(CELL.C12), cells.get(CELL.C22) });
        paths.put("c3", c3);
        r1 = new Path(new Cell[] { cells.get(CELL.C00), cells.get(CELL.C01), cells.get(CELL.C02) });
        paths.put("r1", r1);
        r2 = new Path(new Cell[] { cells.get(CELL.C10), cells.get(CELL.C11), cells.get(CELL.C12) });
        paths.put("r2", r2);
        r3 = new Path(new Cell[] { cells.get(CELL.C20), cells.get(CELL.C21), cells.get(CELL.C22) });
        paths.put("r3", r3);

        p00 = new Path[] { d1, c1, r1 };
        p11 = new Path[] { d1, d2, c2, r2 };
        p22 = new Path[] { d1, c3, r3 };
        p02 = new Path[] { d2, c3, r1 };
        p20 = new Path[] { d2, c1, r3 };
        p01 = new Path[] { c2, r1 };
        p21 = new Path[] { c2, r3 };
        p12 = new Path[] { c3, r2 };
        p10 = new Path[] { r2, c1 };

        cells.get(CELL.C00).setPaths(p00);
        cells.get(CELL.C11).setPaths(p11);
        cells.get(CELL.C22).setPaths(p22);
        cells.get(CELL.C02).setPaths(p02);
        cells.get(CELL.C20).setPaths(p20);
        cells.get(CELL.C01).setPaths(p01);
        cells.get(CELL.C21).setPaths(p21);
        cells.get(CELL.C12).setPaths(p12);
        cells.get(CELL.C10).setPaths(p10);
    }

    private boolean isWon() {
        Collection<Path> myPaths = paths.values();
        for (Path path : myPaths) {
            if (path.isWon()) {
                return true;
            }
        }

        return false;
    }

    private StringBuilder buf = new StringBuilder();

    public void showStatus() {
        buf = new StringBuilder();

        buf.append("\r\n");
        buf.append("\t").append(cells.get(CELL.C00)).append("\t").append(cells.get(CELL.C01)).append("\t").append(
                cells.get(CELL.C02)).append("\r\n");
        buf.append("\t").append(cells.get(CELL.C10)).append("\t").append(cells.get(CELL.C11)).append("\t").append(
                cells.get(CELL.C12)).append("\r\n");
        buf.append("\t").append(cells.get(CELL.C20)).append("\t").append(cells.get(CELL.C21)).append("\t").append(
                cells.get(CELL.C22)).append("\r\n");

        System.out.println(buf.toString());
    }

    public enum CELL {
        C00, C01, C02, C10, C11, C12, C20, C21, C22;
        @Override
        public String toString() {
            return this.name().substring(1);
        }

        public static CELL get(String xxoo) {
            if (xxoo == null)
                return null;

            for (CELL cell : CELL.values()) {
                if (cell.name().equals("C" + xxoo))
                    return cell;
            }

            return null;
        }
    };

    private Cell getBestPlayCell(final Path p[], Cell playedCell) {
        Path[] myPaths = playedCell.getPaths();
        for (Path path : myPaths) {
            if (path.isMajorityO() && !path.isMinorityX()) {
                Cell cell = path.getUnTaken();
                p[0] = path;
                if (cell != null) {
                    return cell;
                }
            }
        }

        for (Path path : myPaths) {
            if (path.isMajorityX() && !path.isMinorityO()) {
                Cell cell = path.getUnTaken();
                p[0] = path;
                if (cell != null) {
                    return cell;
                }
            }
        }

        for (Path path : myPaths) {
            if (path.isMinorityX() && (!path.isMajorityO() || !path.isMinorityO())) {
                Cell cell = path.getUnTaken();
                p[0] = path;
                if (cell != null) {
                    return cell;
                }
            }
        }

        for (Path path : myPaths) {
            if (path.isMinorityO() && (!path.isMajorityX() || !path.isMinorityX())) {
                Cell cell = path.getUnTaken();
                p[0] = path;
                if (cell != null) {
                    return cell;
                }
            }
        }

        Cell c11 = cells.get(CELL.C11);
        if (!c11.isTaken())
            return c11;

        Cell c00 = cells.get(CELL.C00);
        if (!c00.isTaken())
            return c00;

        Cell c22 = cells.get(CELL.C22);
        if (!c22.isTaken())
            return c22;

        Cell c02 = cells.get(CELL.C02);
        if (!c02.isTaken())
            return c02;

        Cell c20 = cells.get(CELL.C20);
        if (!c20.isTaken())
            return c20;

        Cell c01 = cells.get(CELL.C01);
        if (!c01.isTaken())
            return c01;

        Cell c21 = cells.get(CELL.C21);
        if (!c21.isTaken())
            return c21;

        Cell c12 = cells.get(CELL.C12);
        if (!c12.isTaken())
            return c12;

        Cell c10 = cells.get(CELL.C10);
        if (!c10.isTaken())
            return c10;

        return null;
    }

    public String play(String cellBlock) {

        if (this.isWon()) {
            return this.msg;
        }

        if (cellBlock == null) {
            return this.msg;
        }

        this.msg = "valid";

        Cell myCELL = this.cells.get(CELL.get(cellBlock));
        if (myCELL == null) {
            this.msg = "invalid";
        } else if (myCELL.isTaken()) {
            this.msg = "invalid";
        } else {
            myCELL.take(Cell.XO.X);
            Path p[] = new Path[1];
            Cell bestPlayCell = this.getBestPlayCell(p, myCELL);
            if (bestPlayCell != null) {
                bestPlayCell.take(Cell.XO.O);
                if (p != null && p[0] != null && p[0].isWon()) {
                    this.msg = "loss";
                }
            } else {
                this.msg = "draw";
            }
        }

        return this.msg;
    }

    public String getMsg() {
        if ("loss".equals(this.msg))
            return "Sorry, you lose";
        else if ("draw".equals(this.msg))
            return "congrats, you draw";
        return "";
    }

    public static void main(String args[]) throws IOException {
        TicTacToe game = new TicTacToe();
        String msg = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (!"draw".equals(msg) && !"loss".equals(msg)) {
            game.showStatus();

            System.out.print("block an open cell: ");
            String cellBlock = br.readLine();
            System.out.println("cell to be blocked with X : " + cellBlock);

            msg = game.play(cellBlock);
        }

        game.showStatus();

        if (msg != null) {
            if (msg.equals("draw"))
                System.out.println("congratulations! a draw");
            else if (msg.equals("loss")) {
                System.out.println("a loss");
            }
        }

        System.out.println("Ghanks for playing");
    }

    public static void mainx(String args[]) throws IOException {
        TicTacToe game = new TicTacToe();

        int max = 10;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (!game.isWon()) {
            game.showStatus();
            String cellBlock = null;
            Cell myCELL = null;

            while (myCELL == null) {
                System.out.print("block an open cell: ");
                cellBlock = br.readLine();
                System.out.println("cell to be blocked with X : " + cellBlock);

                myCELL = game.cells.get(CELL.get(cellBlock));
                if (myCELL == null) {
                    System.out.println("invalid entry; please block a valid open cell: ");
                    continue;
                }

                if (myCELL.isTaken()) {
                    System.out.println("invalid entry; please block a valid open cell: ");
                    myCELL = null;
                } else {
                    myCELL.take(Cell.XO.X);
                    Path p[] = new Path[1];
                    Cell bestPlayCell = game.getBestPlayCell(p, myCELL);
                    if (bestPlayCell != null) {
                        bestPlayCell.take(Cell.XO.O);
                        if (p != null && p[0] != null && p[0].isWon()) {
                            System.out.println("Game over: you lose!");
                        }
                    } else {
                        System.out.println("Game over: no winner!");
                        count = max;
                        break;
                    }
                }
            }

            count++;
            if (count >= max)
                break;
        }

        game.showStatus();

        System.out.println("Thanks for playing");
    }
}

class Cell {
    public enum XO {
        X, O;

        @Override
        public String toString() {
            if (this == X)
                return "X";
            else if (this == O)
                return "O";
            else
                return "_";
        }
    };

    private final int x;
    private final int y;
    private XO xo;
    private Path[] paths;

    Cell(int x, int y) {
        int xcord = x > 2 ? x = 2 : x;
        xcord = xcord < 0 ? 0 : xcord;

        int ycord = y > 2 ? y = 2 : y;
        ycord = ycord < 0 ? 0 : ycord;

        this.x = xcord;
        this.y = ycord;
    }

    public static Cell getCell(String cellStr) {
        String[] cs = cellStr.split("");
        try {
            return new Cell(Integer.parseInt(cs[0]), Integer.parseInt(cs[1]));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public void take(XO xo) {
        this.xo = xo;
    }

    public boolean isTaken() {
        return this.xo != null;
    }

    public XO getXO() {
        return this.xo;
    }

    public void setPaths(Path[] paths) {
        this.paths = paths;
    }

    public Path[] getPaths() {
        return this.paths;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cell))
            return false;

        if (obj == this)
            return true;

        Cell other = (Cell) obj;

        if (this.x != other.x)
            return false;

        if (this.y != other.y)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return ("" + this.x + this.y).hashCode();
    }

    @Override
    public String toString() {
        if (!this.isTaken())
            return "" + this.x + this.y;
        else
            return this.xo.toString();
    }
}

class Path {
    Map<String, Cell> cells = new HashMap<String, Cell>();

    Path(Cell[] cells) {
        for (Cell cell : cells) {
            this.cells.put(cell.toString(), cell);
        }
    }

    public boolean isTaken() {
        Collection<Cell> cs = cells.values();
        for (Cell cell : cs) {
            if (!cell.isTaken())
                return false;
        }

        return true;
    }

    public Cell getUnTaken() {
        Collection<Cell> cs = cells.values();
        for (Cell cell : cs) {
            if (!cell.isTaken())
                return cell;
        }

        return null;
    }

    public boolean isWon() {
        return isWon(Cell.XO.O) || isWon(Cell.XO.X);
    }

    public boolean isWon(Cell.XO xo) {
        Collection<Cell> cs = cells.values();
        for (Cell cell : cs) {
            if (!cell.isTaken())
                return false;

            if (xo != cell.getXO())
                return false;
        }

        return true;
    }

    public boolean isMajorityO() {
        return this.isMajority(Cell.XO.O);
    }

    public boolean isMajorityX() {
        return this.isMajority(Cell.XO.X);
    }

    public boolean isMajority(Cell.XO xo) {
        Collection<Cell> my = cells.values();
        int count = 0;
        for (Cell cell : my) {
            if (cell.getXO() == xo) {
                count++;
            }
        }

        if (count == 2)
            return true;

        return false;
    }

    public boolean isMinorityO() {
        return this.isMinority(Cell.XO.O);
    }

    public boolean isMinorityX() {
        return this.isMinority(Cell.XO.X);
    }

    public boolean isMinority(Cell.XO xo) {
        Collection<Cell> my = cells.values();
        int count = 0;
        for (Cell cell : my) {
            if (cell.getXO() == xo) {
                count++;
            }
        }

        if (count == 1)
            return true;

        return false;
    }

}
