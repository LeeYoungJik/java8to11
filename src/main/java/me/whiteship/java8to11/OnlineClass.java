package me.whiteship.java8to11;

import java.util.Optional;

public class OnlineClass {


    private Integer id;

    private String title;

    private boolean closed;


    private Progress progress;



    public Optional<Progress> getProgress() {
        return Optional.ofNullable(progress);
        //리턴 타입에만 쓰는거라고 생각하면 좋다.
        //메소드 파라미터, 맵의 키타임등으로도 쓸 수 있지만, 리턴 타입으로만 쓰느것이 권장사항이다.
        //of는 그냥 Null이 아닌거라고 가정. 그래서 null이 들어오며 nullexception이 난다.
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
