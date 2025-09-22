public class ReportHTML implements Report {
    private String title;
    private String content;
    private String style;

    public ReportHTML(String title, String content, String style) {
        this.title = title;
        this.content = content;
        this.style = style;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public String getContent() { return content; }

    @Override
    public void generate() {
        System.out.println("Generando Reporte HTML con estilo: " + style);
    }
}
