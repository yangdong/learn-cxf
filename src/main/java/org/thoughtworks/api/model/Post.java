package org.thoughtworks.api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Post {
    private String content;
    private String title;

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public String getContent() {

        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
