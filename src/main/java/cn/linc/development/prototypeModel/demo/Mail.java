package cn.linc.development.prototypeModel.demo;

public class Mail implements Cloneable{

    private String receriver;

    private String subject;

    private String appellation;

    private String context;

    private String tail;

    public  Mail(AdvTemplate advTemplate){
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    public String getReceriver() {
        return receriver;
    }

    public void setReceriver(String receriver) {
        this.receriver = receriver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        }catch (Exception e){
            System.out.println("原型模式创建错误");
        }
        return mail;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "receriver='" + receriver + '\'' +
                ", subject='" + subject + '\'' +
                ", appellation='" + appellation + '\'' +
                ", context='" + context + '\'' +
                ", tail='" + tail + '\'' +
                '}';
    }
}
