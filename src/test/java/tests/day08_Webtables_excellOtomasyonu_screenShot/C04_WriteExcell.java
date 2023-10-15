package tests.day08_Webtables_excellOtomasyonu_screenShot;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C04_WriteExcell {
    @Test
    public  void writeExcellTesti() throws IOException {
        //
      // 1) Yeni bir Class olusturalim WriteExcel
      // 2) Yeni bir test method olusturalim writeExcelTest()
      // 3) Adimlari takip ederek Sayfa1’de 1.satira kadar gidelim
        String dosyaYolu = "src/test/java/tests/day08_Webtables_excellOtomasyonu_screenShot/ulkeler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sayfa1 = workbook.getSheet("Sayfa1");
      // 4) 5.hucreye yeni bir cell olusturalim
        sayfa1.getRow(0).createCell(4);
      // 5) Olusturdugumuz hucreye “Nufus” yazdiralim
        sayfa1.getRow(0).getCell(4).setCellValue("Nufus");
      // 6) 2.satir nufus kolonuna 1500000 yazdiralim
        sayfa1.getRow(1).createCell(4).setCellValue(15000000);
      // 7) 10.satir nufus kolonuna 250000 yazdiralim
        sayfa1.getRow(9).createCell(4).setCellValue(250000);
      // 8) 15.satir nufus kolonuna 54000 yazdiralim
        sayfa1.getRow(14).createCell(4).setCellValue(54000);
      // 9) Dosyayi kaydedelim
        FileOutputStream fileOutputStream = new FileOutputStream(dosyaYolu);
        workbook.write(fileOutputStream);
      // 10)Dosyayi kapatalim
        fileOutputStream.close();
        fileInputStream.close();
        workbook.close();
    }
}
