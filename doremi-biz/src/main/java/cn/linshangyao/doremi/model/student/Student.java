package cn.linshangyao.doremi.model.student;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private String studentID;
    private String Name;
    private Date birthday;
    private String schoolOn;
    private String type;
    private String gender;
    private long schlID;
    private Date regTime;
    private Date deregTime;
    private Date lastModified;

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the schoolOn
     */
    public String getSchoolOn() {
        return schoolOn;
    }

    /**
     * @param schoolOn the schoolOn to set
     */
    public void setSchoolOn(String schoolOn) {
        this.schoolOn = schoolOn;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the schlID
     */
    public long getSchlID() {
        return schlID;
    }

    /**
     * @param schlID the schlID to set
     */
    public void setSchlID(long schlID) {
        this.schlID = schlID;
    }

    /**
     * @return the regTime
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * @param regTime the regTime to set
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * @return the deregTime
     */
    public Date getDeregTime() {
        return deregTime;
    }

    /**
     * @param deregTime the deregTime to set
     */
    public void setDeregTime(Date deregTime) {
        this.deregTime = deregTime;
    }

    /**
     * @return the lastModified
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified the lastModified to set
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
}
