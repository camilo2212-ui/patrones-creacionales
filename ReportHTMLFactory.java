public class ReportHTMLFactory extends ReportFactory {
    private String style;

    public ReportHTMLFactory(String style) {
        this.style = style;
    }

    @Override
    public Report createReport(String title, String content) {
        return new ReportHTML(title, content, style);
    }
}

// Fábrica para Reportes PDF
public class ReportPDFFactory extends ReportFactory {
    private boolean encrypted;

    public ReportPDFFactory(boolean encrypted) {
        this.encrypted = encrypted;
    }

    @Override
    public Report createReport(String title, String content) {
        return new ReportPDF(title, content, encrypted);
    }
}

// Fábrica para Reportes Excel
public class ReportExcelFactory extends ReportFactory {
    private int sheets;

    public ReportExcelFactory(int sheets) {
        this.sheets = sheets;
    }

    @Override
    public Report createReport(String title, String content) {
        return new ReportExcel(title, content, sheets);
    }
}
