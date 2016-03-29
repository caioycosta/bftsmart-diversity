// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Estado.proto

package bftbench;

public final class EstadoOuterClass {
  private EstadoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EstadoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bftbench.Estado)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 lista = 1;</code>
     */
    java.util.List<java.lang.Integer> getListaList();
    /**
     * <code>repeated int32 lista = 1;</code>
     */
    int getListaCount();
    /**
     * <code>repeated int32 lista = 1;</code>
     */
    int getLista(int index);
  }
  /**
   * Protobuf type {@code bftbench.Estado}
   */
  public static final class Estado extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:bftbench.Estado)
      EstadoOrBuilder {
    // Use Estado.newBuilder() to construct.
    private Estado(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Estado(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Estado defaultInstance;
    public static Estado getDefaultInstance() {
      return defaultInstance;
    }

    public Estado getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Estado(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                lista_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              lista_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                lista_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                lista_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          lista_ = java.util.Collections.unmodifiableList(lista_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return bftbench.EstadoOuterClass.internal_static_bftbench_Estado_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return bftbench.EstadoOuterClass.internal_static_bftbench_Estado_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              bftbench.EstadoOuterClass.Estado.class, bftbench.EstadoOuterClass.Estado.Builder.class);
    }

    public static com.google.protobuf.Parser<Estado> PARSER =
        new com.google.protobuf.AbstractParser<Estado>() {
      public Estado parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Estado(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Estado> getParserForType() {
      return PARSER;
    }

    public static final int LISTA_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> lista_;
    /**
     * <code>repeated int32 lista = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getListaList() {
      return lista_;
    }
    /**
     * <code>repeated int32 lista = 1;</code>
     */
    public int getListaCount() {
      return lista_.size();
    }
    /**
     * <code>repeated int32 lista = 1;</code>
     */
    public int getLista(int index) {
      return lista_.get(index);
    }

    private void initFields() {
      lista_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < lista_.size(); i++) {
        output.writeInt32(1, lista_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < lista_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(lista_.get(i));
        }
        size += dataSize;
        size += 1 * getListaList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static bftbench.EstadoOuterClass.Estado parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bftbench.EstadoOuterClass.Estado parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bftbench.EstadoOuterClass.Estado parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static bftbench.EstadoOuterClass.Estado parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static bftbench.EstadoOuterClass.Estado parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static bftbench.EstadoOuterClass.Estado parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static bftbench.EstadoOuterClass.Estado parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static bftbench.EstadoOuterClass.Estado parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static bftbench.EstadoOuterClass.Estado parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static bftbench.EstadoOuterClass.Estado parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(bftbench.EstadoOuterClass.Estado prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code bftbench.Estado}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bftbench.Estado)
        bftbench.EstadoOuterClass.EstadoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return bftbench.EstadoOuterClass.internal_static_bftbench_Estado_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return bftbench.EstadoOuterClass.internal_static_bftbench_Estado_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                bftbench.EstadoOuterClass.Estado.class, bftbench.EstadoOuterClass.Estado.Builder.class);
      }

      // Construct using bftbench.EstadoOuterClass.Estado.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        lista_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return bftbench.EstadoOuterClass.internal_static_bftbench_Estado_descriptor;
      }

      public bftbench.EstadoOuterClass.Estado getDefaultInstanceForType() {
        return bftbench.EstadoOuterClass.Estado.getDefaultInstance();
      }

      public bftbench.EstadoOuterClass.Estado build() {
        bftbench.EstadoOuterClass.Estado result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public bftbench.EstadoOuterClass.Estado buildPartial() {
        bftbench.EstadoOuterClass.Estado result = new bftbench.EstadoOuterClass.Estado(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          lista_ = java.util.Collections.unmodifiableList(lista_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lista_ = lista_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof bftbench.EstadoOuterClass.Estado) {
          return mergeFrom((bftbench.EstadoOuterClass.Estado)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(bftbench.EstadoOuterClass.Estado other) {
        if (other == bftbench.EstadoOuterClass.Estado.getDefaultInstance()) return this;
        if (!other.lista_.isEmpty()) {
          if (lista_.isEmpty()) {
            lista_ = other.lista_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureListaIsMutable();
            lista_.addAll(other.lista_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        bftbench.EstadoOuterClass.Estado parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (bftbench.EstadoOuterClass.Estado) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> lista_ = java.util.Collections.emptyList();
      private void ensureListaIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          lista_ = new java.util.ArrayList<java.lang.Integer>(lista_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 lista = 1;</code>
       */
      public java.util.List<java.lang.Integer>
          getListaList() {
        return java.util.Collections.unmodifiableList(lista_);
      }
      /**
       * <code>repeated int32 lista = 1;</code>
       */
      public int getListaCount() {
        return lista_.size();
      }
      /**
       * <code>repeated int32 lista = 1;</code>
       */
      public int getLista(int index) {
        return lista_.get(index);
      }
      /**
       * <code>repeated int32 lista = 1;</code>
       */
      public Builder setLista(
          int index, int value) {
        ensureListaIsMutable();
        lista_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lista = 1;</code>
       */
      public Builder addLista(int value) {
        ensureListaIsMutable();
        lista_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lista = 1;</code>
       */
      public Builder addAllLista(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureListaIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lista_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lista = 1;</code>
       */
      public Builder clearLista() {
        lista_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:bftbench.Estado)
    }

    static {
      defaultInstance = new Estado(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:bftbench.Estado)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bftbench_Estado_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_bftbench_Estado_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Estado.proto\022\010bftbench\"\027\n\006Estado\022\r\n\005li" +
      "sta\030\001 \003(\005"
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
        }, assigner);
    internal_static_bftbench_Estado_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bftbench_Estado_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_bftbench_Estado_descriptor,
        new java.lang.String[] { "Lista", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
