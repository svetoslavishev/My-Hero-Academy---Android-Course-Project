package slav40.myheroacademy.models;

public class Character
{
    private String name;
    private String description;

    public Character(String name, String description)
    {
        setName(name);
        setDescription(description);
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

    @Override
    public String toString()
    {
        return getName();
    }
}
