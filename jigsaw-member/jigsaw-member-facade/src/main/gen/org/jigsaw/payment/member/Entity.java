// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.jigsaw.payment.member;

public final class Entity {
  private Entity() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Customer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Customer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_Login_Password_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_Login_Password_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_Payment_Password_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_Payment_Password_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Company_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Company_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014entity.proto\032\014taglib.proto\032\013enums.prot" +
      "o\"\244\005\n\010Customer\022\013\n\003key\030\001 \001(\003\022\n\n\002id\030\002 \001(\003\022" +
      "\034\n\014created_time\030\003 \001(\003B\006\212\246\035\002\020\007\022\034\n\014updated" +
      "_time\030\005 \001(\003B\006\212\246\035\002\020\007\022\021\n\006status\030\007 \001(\005:\0011\022\022" +
      "\n\007version\030\010 \001(\005:\0010\022\021\n\tfull_name\030\013 \002(\t\022 \n" +
      "\006gender\030\014 \001(\0162\020.Customer.Gender\022\'\n\nauth_" +
      "state\030\r \001(\0162\023.Customer.AuthState\022)\n\013auth" +
      "_method\030\016 \001(\0162\024.Customer.AuthMethod\022\021\n\ta" +
      "uth_time\030\017 \001(\003\022\025\n\rcanceled_date\030\020 \001(\003\022\027\n" +
      "\017canceled_reason\030\021 \001(\t\022\022\n\nuser_count\030\022 \001" +
      "(\005\022\030\n\020valid_user_count\030\023 \001(\005\"2\n\006Gender\022\022" +
      "\n\016UNKNOWN_GENDER\020\000\022\010\n\004MALE\020\001\022\n\n\006FEMALE\020\002" +
      "\"L\n\tAuthState\022\026\n\022UNKNOWN_AUTH_STATE\020\000\022\024\n" +
      "\020UN_AUTHENTICATED\020\001\022\021\n\rAUTHENTICATED\020\002\"\202" +
      "\001\n\nAuthMethod\022\027\n\023UNKNOWN_AUTH_METHOD\020\000\022\021" +
      "\n\rAUTH_BY_EMAIL\020\001\022\017\n\013AUTH_BY_SMS\020\002\022\025\n\021AU" +
      "TH_BY_BANK_CARD\020\004\022\016\n\nAUTH_BY_ID\020\005\022\020\n\014AUT" +
      "H_BY_FACE\020\006:\033\202\246\035\021\n\017entity_customer\202\246\035\002\020\n" +
      "\"\205\004\n\004User\022\013\n\003key\030\001 \001(\003\022\n\n\002id\030\002 \001(\003\022\034\n\014cr" +
      "eated_time\030\003 \001(\003B\006\212\246\035\002\020\007\022\034\n\014updated_time" +
      "\030\005 \001(\003B\006\212\246\035\002\020\007\022\021\n\006status\030\007 \001(\005:\0011\022\022\n\007ver" +
      "sion\030\010 \001(\005:\0010\022\021\n\tuser_name\030\013 \002(\t\022\020\n\010nick" +
      "name\030\014 \001(\t\022\026\n\016security_phone\030\r \001(\t\022\026\n\016se" +
      "curity_email\030\016 \001(\t\022\026\n\016security_level\030\017 \001" +
      "(\005\022\022\n\nidentified\030\020 \001(\010\022\023\n\013customer_id\030\021 " +
      "\001(\003\022\022\n\nis_trusted\030\022 \001(\010\022\025\n\rregister_date" +
      "\030\023 \001(\003\022\030\n\020register_channel\030\024 \001(\t\022\025\n\rregi" +
      "ster_memo\030\025 \001(\t\022\026\n\016activated_date\030\026 \001(\003\022" +
      "\025\n\rcanceled_date\030\027 \001(\003\022\027\n\017canceled_reaso" +
      "n\030\030 \001(\t\022\025\n\rlast_login_ip\030\031 \001(\t\022\027\n\017last_l" +
      "ogin_time\030\032 \001(\003:\027\202\246\035\r\n\013entity_user\202\246\035\002\020\n" +
      "\"\360\002\n\023User_Login_Password\022\013\n\003key\030\001 \001(\003\022\017\n" +
      "\007user_id\030\002 \001(\003\022\034\n\014created_time\030\003 \001(\003B\006\212\246" +
      "\035\002\020\007\022\034\n\014updated_time\030\005 \001(\003B\006\212\246\035\002\020\007\022\021\n\006st" +
      "atus\030\007 \001(\005:\0011\022\022\n\007version\030\010 \001(\005:\0010\022/\n\004typ" +
      "e\030\013 \002(\0162!.User_Login_Password.PasswordTy" +
      "pe\022\023\n\013locked_time\030\014 \001(\003\022\025\n\rlocked_reason" +
      "\030\r \001(\t\022\014\n\004salt\030\016 \001(\t\022\020\n\010password\030\017 \001(\t\022\017" +
      "\n\007is_init\030\020 \001(\010\022\022\n\nis_changed\030\021 \001(\010\"6\n\014P" +
      "asswordType\022\031\n\025UNKNOWN_PASSWORD_TYPE\020\000\022\013" +
      "\n\007DEFAULT\020\001\"\364\002\n\025User_Payment_Password\022\013\n" +
      "\003key\030\001 \001(\003\022\017\n\007user_id\030\002 \001(\003\022\034\n\014created_t" +
      "ime\030\003 \001(\003B\006\212\246\035\002\020\007\022\034\n\014updated_time\030\005 \001(\003B" +
      "\006\212\246\035\002\020\007\022\021\n\006status\030\007 \001(\005:\0011\022\022\n\007version\030\010 " +
      "\001(\005:\0010\0221\n\004type\030\013 \002(\0162#.User_Payment_Pass" +
      "word.PasswordType\022\023\n\013locked_time\030\014 \001(\003\022\025" +
      "\n\rlocked_reason\030\r \001(\t\022\014\n\004salt\030\016 \001(\t\022\020\n\010p" +
      "assword\030\017 \001(\t\022\017\n\007is_init\030\020 \001(\010\022\022\n\nis_cha" +
      "nged\030\021 \001(\010\"6\n\014PasswordType\022\031\n\025UNKNOWN_PA" +
      "SSWORD_TYPE\020\000\022\013\n\007DEFAULT\020\001\"\310\002\n\007Company\022\013" +
      "\n\003key\030\001 \001(\003\022\n\n\002id\030\002 \001(\003\022\033\n\013create_time\030\003" +
      " \001(\003B\006\212\246\035\002\020\007\022\023\n\013create_user\030\004 \001(\t\022\033\n\013upd" +
      "ate_time\030\005 \001(\003B\006\212\246\035\002\020\007\022\023\n\013update_user\030\006 " +
      "\001(\t\022\021\n\006status\030\007 \001(\005:\0011\022\022\n\007version\030\010 \001(\005:" +
      "\0010\022\014\n\004name\030\t \002(\t\022\031\n\004type\030\014 \002(\0162\013.EntityT" +
      "ype\022\020\n\010icon_url\030\r \001(\t\022\024\n\014contact_name\030\016 " +
      "\001(\t\022\025\n\rcontact_email\030\017 \001(\t\022\025\n\rcontact_ph" +
      "one\030\032 \001(\t:\032\202\246\035\020\n\016entity_company\202\246\035\002\020\013B\035\n" +
      "\031org.jigsaw.payment.memberP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.jigsaw.payment.model.Taglib.getDescriptor(),
          org.jigsaw.payment.model.Enums.getDescriptor(),
        }, assigner);
    internal_static_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Customer_descriptor,
        new java.lang.String[] { "Key", "Id", "CreatedTime", "UpdatedTime", "Status", "Version", "FullName", "Gender", "AuthState", "AuthMethod", "AuthTime", "CanceledDate", "CanceledReason", "UserCount", "ValidUserCount", });
    internal_static_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_descriptor,
        new java.lang.String[] { "Key", "Id", "CreatedTime", "UpdatedTime", "Status", "Version", "UserName", "Nickname", "SecurityPhone", "SecurityEmail", "SecurityLevel", "Identified", "CustomerId", "IsTrusted", "RegisterDate", "RegisterChannel", "RegisterMemo", "ActivatedDate", "CanceledDate", "CanceledReason", "LastLoginIp", "LastLoginTime", });
    internal_static_User_Login_Password_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_User_Login_Password_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_Login_Password_descriptor,
        new java.lang.String[] { "Key", "UserId", "CreatedTime", "UpdatedTime", "Status", "Version", "Type", "LockedTime", "LockedReason", "Salt", "Password", "IsInit", "IsChanged", });
    internal_static_User_Payment_Password_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_User_Payment_Password_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_Payment_Password_descriptor,
        new java.lang.String[] { "Key", "UserId", "CreatedTime", "UpdatedTime", "Status", "Version", "Type", "LockedTime", "LockedReason", "Salt", "Password", "IsInit", "IsChanged", });
    internal_static_Company_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Company_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Company_descriptor,
        new java.lang.String[] { "Key", "Id", "CreateTime", "CreateUser", "UpdateTime", "UpdateUser", "Status", "Version", "Name", "Type", "IconUrl", "ContactName", "ContactEmail", "ContactPhone", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.jigsaw.payment.model.Taglib.columnOption);
    registry.add(org.jigsaw.payment.model.Taglib.tableOption);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.jigsaw.payment.model.Taglib.getDescriptor();
    org.jigsaw.payment.model.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
