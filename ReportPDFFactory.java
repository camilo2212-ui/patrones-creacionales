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


