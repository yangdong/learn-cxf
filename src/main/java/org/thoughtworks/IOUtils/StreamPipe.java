package org.thoughtworks.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamPipe {
    public static final int BUFFER_SIZE = 4096;
    private InputStream inputStream;
    private OutputStream outputStream;

    private StreamPipe(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }

    public static StreamPipe pipe(InputStream inputStream, OutputStream outputStream) {
        return new StreamPipe(inputStream, outputStream);
    }

    public int transfer() {
        if (inputStream == null || outputStream == null) {
            return -1;
        }

        byte[] bytes = new byte[BUFFER_SIZE];

        try {
            for (; (inputStream.read(bytes)) > 0; ) {
                outputStream.write(bytes);
            }

            outputStream.flush();
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            return -1;
        }
        return 0;
    }

}
