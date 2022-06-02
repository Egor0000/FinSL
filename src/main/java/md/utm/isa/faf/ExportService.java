package md.utm.isa.faf;

import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.Asset;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.BalanceSheet;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.Equity;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.Liability;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Field;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExportService {
    public static void exportBalanceSheetToXLSX(BalanceSheet balanceSheet) throws Exception {
        int rowCnt = 0;
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet(String.format("Balance Sheet %s", balanceSheet.getName()));
        sheet.setColumnWidth(0, 6000);
        sheet.setColumnWidth(1, 4000);

        addHeaderCell(workbook, sheet, "assets" , "", rowCnt);

        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);

        rowCnt++;

        // Export assets
        List<String> assetsFields = Arrays.stream(Asset.class.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toList());

        for (int i =0; i<assetsFields.size(); i++) {
            writeAssets(sheet, balanceSheet, assetsFields.get(i), style, rowCnt);
            rowCnt++;
        }

        addHeaderCell(workbook, sheet, "liability" , "", rowCnt);

        style = workbook.createCellStyle();
        style.setWrapText(true);

        rowCnt++;

        // Export liability
        List<String> liabilityFields = Arrays.stream(Liability.class.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toList());

        for (int i =0; i<liabilityFields.size(); i++) {
            writeLiability(sheet, balanceSheet, liabilityFields.get(i), style, rowCnt);
            rowCnt++;
        }

        addHeaderCell(workbook, sheet, "equity" , "", rowCnt);

        style = workbook.createCellStyle();
        style.setWrapText(true);

        rowCnt++;

        // Export equity
        List<String> equityFields = Arrays.stream(Equity.class.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toList());

        for (int i =0; i<equityFields.size(); i++) {
            writeEquity(sheet, balanceSheet, equityFields.get(i), style, rowCnt);
            rowCnt++;
        }

        // Write to file
        String exportDir = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();

        exportDir = exportDir.replace("\\", "/") + "/exportedSheets";


        File directory = new File(exportDir);
        if (! directory.exists()){
            directory.mkdir();
            // If you require it to make the entire directory path including parents,
            // use directory.mkdirs(); here instead.
        }

        String fileLocation = exportDir
                + String.format("/balance_sheet_%s_%s.xlsx", balanceSheet.getName(), ZonedDateTime.now().toInstant().toEpochMilli());

        FileOutputStream outputStream = new FileOutputStream(fileLocation);
        workbook.write(outputStream);
        workbook.close();
    }


    private static void writeAssets(Sheet sheet, BalanceSheet balanceSheet, String field, CellStyle style, int rowCnt) {
        if (balanceSheet.getAsset()==null) {
            return;
        }

        Row row = sheet.createRow(rowCnt);

        Cell cell = row.createCell(0);
        cell.setCellValue(field);
        cell.setCellStyle(style);

        style.setDataFormat((short) 2);
        cell = row.createCell(1);
        cell.setCellStyle(style);

        Asset asset = balanceSheet.getAsset();

        switch (field) {
            case "cash":
                cell.setCellValue(asset.getCash());
                break;
            case "expenses":
                cell.setCellValue(asset.getExpenses());
                break;
            case "inventory":
                cell.setCellValue(asset.getInventory());
                break;
            case "accounts":
                cell.setCellValue(asset.getAccounts());
                break;
            case "longTerm":
                cell.setCellValue(asset.getLongTerm());
                break;
        }

    }

    private static void writeLiability(Sheet sheet, BalanceSheet balanceSheet, String field, CellStyle style, int rowCnt) {
        if (balanceSheet.getLiability()==null) {
            return;
        }

        Row row = sheet.createRow(rowCnt);

        Cell cell = row.createCell(0);
        cell.setCellValue(field);
        cell.setCellStyle(style);

        style.setDataFormat((short) 2);
        cell = row.createCell(1);
        cell.setCellStyle(style);

        Liability liability = balanceSheet.getLiability();

        switch (field) {
            case "others":
                cell.setCellValue(liability.getOthers());
                break;
            case "accounts":
                cell.setCellValue(liability.getAccounts());
                break;
            case "longTerm":
                cell.setCellValue(liability.getLongTerm());
                break;
        }
    }

    private static void writeEquity(Sheet sheet, BalanceSheet balanceSheet, String field, CellStyle style, int rowCnt) {
        if (balanceSheet.getEquity()==null) {
            return;
        }

        Row row = sheet.createRow(rowCnt);

        Cell cell = row.createCell(0);
        cell.setCellValue(field);
        cell.setCellStyle(style);

        style.setDataFormat((short) 2);
        cell = row.createCell(1);
        cell.setCellStyle(style);

        Equity equity = balanceSheet.getEquity();

        switch (field) {
            case "capital":
                cell.setCellValue(equity.getCapital());
                break;
            case "retained":
                cell.setCellValue(equity.getRetained());
                break;
        }
    }


    private static void addHeaderCell(Workbook workbook, Sheet sheet, String key, String value, int rowCnt) {
        Row header = sheet.createRow(rowCnt);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFFont font = ((XSSFWorkbook) workbook).createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 16);
        font.setBold(true);
        headerStyle.setFont(font);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue(key);
        headerCell.setCellStyle(headerStyle);


        headerCell = header.createCell(1);
        headerCell.setCellValue(value);
        headerCell.setCellStyle(headerStyle);
    }
}


