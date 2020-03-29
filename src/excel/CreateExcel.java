package excel;

import java.io.File;  
import java.util.Date;  
import jxl.CellType;  
import jxl.Workbook;  
import jxl.format.Border;  
import jxl.format.BorderLineStyle;  
import jxl.format.Colour;  
import jxl.format.VerticalAlignment;  
import jxl.format.Alignment;  
import jxl.write.DateFormat;  
import jxl.write.Label;  
import jxl.write.NumberFormat;  
import jxl.write.WritableCellFormat;  
import jxl.write.WritableFont;  
import jxl.write.WritableSheet;  
import jxl.write.WritableWorkbook;  
import jxl.write.Number;  
import jxl.write.DateTime;  
import jxl.write.WriteException; 

public class CreateExcel {  
    public static void main(String args[]) {  
        try {  
            // ���ļ�  
            WritableWorkbook book = Workbook  
                    .createWorkbook(new File("C:/Users/SPACE/Desktop/test.xls"));  
            // ������Ϊ��sheet1���Ĺ���������0��ʾ���ǵ�һҳ  
            WritableSheet sheet = book.createSheet("sheet1", 0);  
            // ��Label����Ĺ�������ָ����Ԫ��λ���ǵ�һ�е�һ��(0,0),��Ԫ������Ϊstring  
            Label label = new Label(0, 0, "string",  
                    getDataCellFormat(CellType.LABEL));  
            // ������õĵ�Ԫ����ӵ���������  
            sheet.addCell(label);  
            // ����һ���������ֵĵ�Ԫ��,��Ԫ��λ���ǵڶ��У���һ�У���Ԫ�������Ϊ1234.5  
            Number number = new Number(1, 0, 1234.5,  
                    getDataCellFormat(CellType.NUMBER));  
            sheet.addCell(number);  
            // ����һ���������ڵĵ�Ԫ�񣬵�Ԫ��λ���ǵ����У���һ�У���Ԫ�������Ϊ��ǰ����  
            DateTime dtime = new DateTime(2, 0, new Date(),  
                    getDataCellFormat(CellType.DATE));  
            sheet.addCell(dtime);  
            // д�����ݲ��ر��ļ�  
            book.write();  
            book.close();  
        } catch (Exception e) {  
            System.out.println(e);  
        }  
    }  
    public static WritableCellFormat getDataCellFormat(CellType type) {  
        WritableCellFormat wcf = null;  
        try {  
            // ������ʽ  
            if (type == CellType.NUMBER || type == CellType.NUMBER_FORMULA) {// ����  
                NumberFormat nf = new NumberFormat("#.00");  
                wcf = new WritableCellFormat(nf);  
            } else if (type == CellType.DATE) {// ����  
                DateFormat df = new DateFormat("yyyy-MM-dd hh:mm:ss");  
                wcf = new WritableCellFormat(df);  
            } else {  
                WritableFont wf = new WritableFont(WritableFont.TIMES, 10,  
                        WritableFont.NO_BOLD, false);  
                // ������ɫ  
                wf.setColour(Colour.RED);  
                wcf = new WritableCellFormat(wf);  
            }  
            // ���뷽ʽ  
            wcf.setAlignment(Alignment.CENTRE);  
            wcf.setVerticalAlignment(VerticalAlignment.CENTRE);  
            // �����ϱ߿�  
            wcf.setBorder(Border.TOP, BorderLineStyle.THIN);  
            // �����±߿�  
            wcf.setBorder(Border.BOTTOM, BorderLineStyle.THIN);  
            // ������߿�  
            wcf.setBorder(Border.LEFT, BorderLineStyle.THIN);  
            // �����ұ߿�  
            wcf.setBorder(Border.RIGHT, BorderLineStyle.THIN);  
            // ���ñ���ɫ  
            wcf.setBackground(Colour.YELLOW);  
            // �Զ�����  
            wcf.setWrap(true);  
        } catch (WriteException e) {  
            e.printStackTrace();  
        }  
        return wcf;  
    }  
}