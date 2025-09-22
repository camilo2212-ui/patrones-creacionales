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



    @Override
    public Report createReport(String title, String content) {
        return new ReportExcel(title, content, sheets);
    }
}
