package studentsEntry.studententry.Configs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoodleCourse {
    
    private Integer id;
    private String shortname;
    private Integer categoryid;
    private String fullname;
    private String displayname;
    private String idnumber;
    private String summary;
    private Integer numsections;
    private MoodleCustomFields customfields;

    public MoodleCourse() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortname() {
        return this.shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public Integer getCategoryid() {
        return this.categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDisplayname() {
        return this.displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getIdnumber() {
        return this.idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getNumsections() {
        return this.numsections;
    }

    public void setNumsections(Integer numsections) {
        this.numsections = numsections;
    }

    public MoodleCustomFields getCustomfields() {
        return this.customfields;
    }

    public void setCustomfields(MoodleCustomFields customfields) {
        this.customfields = customfields;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + id+ "'" +
            ", shortname='" + shortname + "'" +
            ", categoryid='" + categoryid + "'" +
            ", fullname='" + fullname + "'" +
            ", displayname='" + displayname + "'" +
            ", idnumber='" + idnumber + "'" +
            ", summary='" + summary + "'" +
            ", numsections='" + numsections + "'" +
            // ", customfields='" + customfields + "'" +
            "}";
    }

}
