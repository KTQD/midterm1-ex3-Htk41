import java.io.*;

public class Main {
    public static void main(String[] args) {

        
        try {
            // Đọc nội dung từ file input.txt
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // Thay thế từ "Nha Trang" thành "Vũng Tàu" trong nội dung đọc được
            String replacedContent = content.toString().replaceAll("Nha Trang", "Vũng Tàu");

            // Ghi nội dung đã thay thế vào file output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(replacedContent);
            writer.close();

            System.out.println("Đã thay thế và ghi vào file output.txt thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc hoặc ghi file: " + e.getMessage());
        }
    }
}


    }
}
