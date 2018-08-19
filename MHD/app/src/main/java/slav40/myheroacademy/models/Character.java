package slav40.myheroacademy.models;

public class Character
{
    private String name;
    private String realName;
    private String description;
    private int imgURL;
    private int detailedImgURL;

    public Character(String name, String realName, String description, int imgURL, int detailedImgURL)
    {
        setName(name);
        setRealName(realName);
        setDescription(description);
        setImgURL(imgURL);
        setDetailedImgURL(detailedImgURL);
    }

    public String getName()
    {
        return name;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    private void setDescription(String description)
    {
        this.description = description;
    }

    public int getImgURL()
    {
        return imgURL;
    }

    private void setImgURL(int imgURL)
    {
        this.imgURL = imgURL;
    }

    private void setRealName(String realName)
    {
        this.realName = realName;
    }

    public String getRealName()
    {
        return realName;
    }

    private void setDetailedImgURL(int detailedImgURL)
    {
        this.detailedImgURL = detailedImgURL;
    }

    public int getDetailedImgURL()
    {
        return detailedImgURL;
    }
}
