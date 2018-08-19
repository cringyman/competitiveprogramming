import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/*
ID: lotfiay2
LANG: JAVA
TASK: friday
*/
 class friday {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            inputStream = new FileInputStream("friday.in");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        OutputStream outputStream;
        try {
            outputStream = new FileOutputStream("friday.out");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        frida solver = new frida();
        solver.solve(1, in, out);
        out.close();
    }

    static class frida {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int[] year = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int[] yearl = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int[] days = new int[7];
            int day = 13;
            int yer = 1900;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 12; j++) {
                    days[day % 7]++;
                    if (isLeapyear(yer + i)) {
                        day += yearl[j];
                    } else {
                        day += year[j];
                    }
                }
            }
            out.print(days[6]);
            out.print(' ');
            out.print(days[0]);
            out.print(' ');
            out.print(days[1]);
            out.print(' ');
            out.print(days[2]);
            out.print(' ');
            out.print(days[3]);
            out.print(' ');
            out.print(days[4]);
            out.print(' ');
            out.println(days[5]);
            out.close();

        }

        static boolean isLeapyear(int n) {
            return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(char i) {
            writer.print(i);
        }

        public void close() {
            writer.close();
        }

        public void print(int i) {
            writer.print(i);
        }

        public void println(int i) {
            writer.println(i);
        }

    }
}

