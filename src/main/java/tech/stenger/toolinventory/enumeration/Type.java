package tech.stenger.toolinventory.enumeration;

/**
 * @author Tobias Stenger (tobias.m.stenger@gmail.com)
 * List of Possible Tool Types
 */

public enum Type {
    TOOL_H("Handwerkzeug"),
    TOOL_B("Bohren & Stemmen"),
    TOOL_S("Sägen"),
    TOOL_C("Schleifer"),
    TOOL_A("Sauger & Reinigungsgeräte"),
    TOOL_R("Schrauber"),
    TOOL_D("Druckluftwerkzeug"),
    TOOL_T("Tacker & Nagler"),
    TOOL_M("Messgerät"),
    TOOL_F("Hobel & Fräsen"),
    TOOL_X("Sonstiges");

    private final String type;

    Type(String pType) {
        this.type = pType;
    }

    public String getType() {
        return this.type;
    }
}
