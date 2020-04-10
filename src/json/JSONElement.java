package json;

import structures.JSONAttributeMap;
import structures.JSONElementMap;

public class JSONElement extends JSONObject
{
    public String name = "";

    public JSONNamespace namespace;

    public JSONData datum;

    public JSONElementMap children = new JSONElementMap();

    public JSONAttributeMap attributes = new JSONAttributeMap();

    //

    public JSONElement()
    {
        this.name = "";
    }

    public JSONElement(String name)
    {
        this.name = name;
    }

    //

    public JSONElement getFirstChild()
    {
        return this.children.getFirstChild();
    }

    public JSONElement getLastChild()
    {
        return this.children.getLastChild();
    }

    public void setNamespace(JSONNamespace namespace)
    {
        this.namespace = namespace;
    }

    public void setAttribute(JSONAttribute attr)
    {
        this.attributes.keys.add(attr.key);

        this.attributes.values.add(attr.value);
    }

    public JSONElement addElement(JSONElement element, JSONData datum, JSONAttribute...attrs)
    {
        this.children.names.add(element.name);

        this.children.values.add(element);

        this.datum = datum;

        for(JSONAttribute attribute : attrs)
        {
            this.attributes.keys.add(attribute.key);

            this.attributes.values.add(attribute.value);
        }

        return element;
    }

    public JSONElement addElement(JSONElement element, JSONAttribute...attrs)
    {
        this.children.names.add(element.name);

        this.children.values.add(element);

        for(JSONAttribute attribute : attrs)
        {
            this.attributes.keys.add(attribute.key);

            this.attributes.values.add(attribute.value);
        }

        return element;
    }

    public JSONElement addElement(JSONElement element)
    {
        this.children.names.add(element.name);

        this.children.values.add(element);

        return element;
    }

    public Boolean hasChildren()
    {
        return this.children.names.size()>0;
    }

    public Boolean hasAttributes()
    {
        return this.attributes.keys.size()>0;
    }

    public Boolean hasTextnode()
    {
        return this.datum!=null;
    }

    public JSONElementMap getChildren()
    {
        return this.children;
    }

    public JSONNamespace getNamespace()
    {
        return this.namespace;
    }

    public JSONAttributeMap getAttributes()
    {
        return this.attributes;
    }
}
