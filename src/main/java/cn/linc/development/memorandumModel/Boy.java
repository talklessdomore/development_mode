package cn.linc.development.memorandumModel;

/**
 * 描述:
 * 男孩
 *
 * @author xiechenglin
 * @create 2018-12-22 15:27
 */
public class Boy {
    private String status;

    public void changeState(){
        this.status = "可能状况不好";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memento createMemento(){
        Memento memento = new Memento();
        memento.setStatus(this.status);
        return memento;
    }

    public void restoreMemento(Memento memento){
        this.status = memento.getStatus();
    }

    @Override
    public String toString() {
        return "Boy{" +
                "status='" + status + '\'' +
                '}';
    }
}
