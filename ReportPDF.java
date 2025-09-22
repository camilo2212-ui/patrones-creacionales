public class ReportPDF implements Report {
    private String title;
    private String content;
    private boolean encrypted;

    public ReportPDF(String title, String content, boolean encrypted) {
        this.title = title;
        this.content = content;
        this.encrypted = encrypted;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public String getContent() { return content; }

    @Override
    public void generate() {
        System.out.println("Generando Reporte PDF. Encriptado: " + encrypted);
    }
}
