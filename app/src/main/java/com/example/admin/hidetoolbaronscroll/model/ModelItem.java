package com.example.admin.hidetoolbaronscroll.model;

/**
 * Created by Admin on 07-04-2017.
 */

public class ModelItem {
    String id;
    String name;
    int profilepic;

    public ModelItem(String id, String name, int profilepic) {
        this.id = id;
        this.name = name;
        this.profilepic = profilepic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(int profilepic) {
        this.profilepic = profilepic;
    }
}
