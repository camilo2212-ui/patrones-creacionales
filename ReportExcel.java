public class ReportExcel implements Report {
    private String title;
    private String content;
    private int sheets;

    public ReportExcel(String title, String content, int sheets) {
        this.title = title;
        this.content = content;
        this.sheets = sheets;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public String getContent() { return content; }

    @Override
    public void generate() {
        System.out.println("Generando Reporte Excel con " + sheets + " hojas");
    }
}
