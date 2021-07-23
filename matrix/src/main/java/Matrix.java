class Matrix {
    int[][] rows;
    int[][] cols;

    Matrix(String matrixAsString) {
        String[] splitRows = matrixAsString.split("\n");
        int nrows = splitRows.length;
        int ncols = splitRows[0].split(" ").length;

        rows = new int[nrows][ncols];
        cols = new int[ncols][nrows];

        for (int i = 0; i < nrows; i++) {
            String[] splitRow = splitRows[i].split(" ");

            for (int j = 0; j < ncols; j++) {
                int element = Integer.parseInt(splitRow[j]);

                rows[i][j] = cols[j][i] = element;
            }
        }
    }

    int[] getRow(int rowNumber) {
        return rows[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        return cols[columnNumber - 1];
    }
}
