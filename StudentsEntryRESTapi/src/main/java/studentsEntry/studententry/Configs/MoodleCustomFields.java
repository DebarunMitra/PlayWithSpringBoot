package studentsEntry.studententry.Configs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoodleCustomFields {

    private String name;
    private String shortname;
    private String valueraw;
    private String value;

    public MoodleCustomFields() {
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return this.shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getValueraw() {
        return this.valueraw;
    }

    public void setValueraw(String valueraw) {
        this.valueraw = valueraw;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", shortname='" + shortname + "'" +
            ", valueraw='" + valueraw + "'" +
            ", value='" + value + "'" +
            "}";
    }


}
