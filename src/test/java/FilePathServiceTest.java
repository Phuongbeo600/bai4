

import org.example.FilePathService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// THIẾU DÒNG NÀY NÈ:
public class FilePathServiceTest {

    @Test
    public void testGetPath() {
        FilePathService service = new FilePathService();
        String result = service.getProjectFolderPath("data", "logs");

        // Tạo đường dẫn kỳ vọng dựa trên hệ điều hành hiện tại
        String expected = "data" + java.io.File.separator + "logs";

        assertEquals(expected, result);
    }

} // VÀ THIẾU DẤU ĐÓNG NGOẶC NÀY NỮA