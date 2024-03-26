import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntry.Builder;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.util.EnumSet;

public class AclEntry_Builder_6 {
    public static void main(String[] args) {
        UserPrincipal userPrincipal = null; // replace with your UserPrincipal
        Builder builder = AclEntry.newBuilder(userPrincipal);
        builder.setType(AclEntry.Type.ALLOW);
        builder.setPermissions(EnumSet.of(AclEntryPermission.READ, AclEntryPermission.WRITE));
        builder.setFlags(EnumSet.of(AclEntryFlag.FILE_INHERIT, AclEntryFlag.DIRECTORY_INHERIT));
        AclEntry aclEntry = builder.build();
        System.out.println(aclEntry);
    }
}
