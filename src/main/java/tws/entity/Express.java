package tws.entity;

import java.io.Serializable;

/**
 * 功能描述 : TODO
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-09-05 16:08
 */
public class Express implements Serializable {
    private String id;
    private String name;
    private String phone;
    private String status;
    private String date;

    public Express() {
    }

    public Express(String id, String name, String phone, String status, String date) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.date = date;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
