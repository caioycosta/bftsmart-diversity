// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Estado.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "Estado.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace bftbench {

namespace {

const ::google::protobuf::Descriptor* Estado_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  Estado_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_Estado_2eproto() {
  protobuf_AddDesc_Estado_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "Estado.proto");
  GOOGLE_CHECK(file != NULL);
  Estado_descriptor_ = file->message_type(0);
  static const int Estado_offsets_[1] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Estado, lista_),
  };
  Estado_reflection_ =
    new ::google::protobuf::internal::GeneratedMessageReflection(
      Estado_descriptor_,
      Estado::default_instance_,
      Estado_offsets_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Estado, _has_bits_[0]),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Estado, _unknown_fields_),
      -1,
      ::google::protobuf::DescriptorPool::generated_pool(),
      ::google::protobuf::MessageFactory::generated_factory(),
      sizeof(Estado));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
inline void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_Estado_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
    Estado_descriptor_, &Estado::default_instance());
}

}  // namespace

void protobuf_ShutdownFile_Estado_2eproto() {
  delete Estado::default_instance_;
  delete Estado_reflection_;
}

void protobuf_AddDesc_Estado_2eproto() {
  static bool already_here = false;
  if (already_here) return;
  already_here = true;
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\014Estado.proto\022\010bftbench\"\027\n\006Estado\022\r\n\005li"
    "sta\030\001 \003(\005", 49);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "Estado.proto", &protobuf_RegisterTypes);
  Estado::default_instance_ = new Estado();
  Estado::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_Estado_2eproto);
}

// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_Estado_2eproto {
  StaticDescriptorInitializer_Estado_2eproto() {
    protobuf_AddDesc_Estado_2eproto();
  }
} static_descriptor_initializer_Estado_2eproto_;

// ===================================================================

#ifndef _MSC_VER
const int Estado::kListaFieldNumber;
#endif  // !_MSC_VER

Estado::Estado()
  : ::google::protobuf::Message() {
  SharedCtor();
  // @@protoc_insertion_point(constructor:bftbench.Estado)
}

void Estado::InitAsDefaultInstance() {
}

Estado::Estado(const Estado& from)
  : ::google::protobuf::Message() {
  SharedCtor();
  MergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:bftbench.Estado)
}

void Estado::SharedCtor() {
  _cached_size_ = 0;
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

Estado::~Estado() {
  // @@protoc_insertion_point(destructor:bftbench.Estado)
  SharedDtor();
}

void Estado::SharedDtor() {
  if (this != default_instance_) {
  }
}

void Estado::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* Estado::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return Estado_descriptor_;
}

const Estado& Estado::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_Estado_2eproto();
  return *default_instance_;
}

Estado* Estado::default_instance_ = NULL;

Estado* Estado::New() const {
  return new Estado;
}

void Estado::Clear() {
  lista_.Clear();
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
  mutable_unknown_fields()->Clear();
}

bool Estado::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:bftbench.Estado)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // repeated int32 lista = 1;
      case 1: {
        if (tag == 8) {
         parse_lista:
          DO_((::google::protobuf::internal::WireFormatLite::ReadRepeatedPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 1, 8, input, this->mutable_lista())));
        } else if (tag == 10) {
          DO_((::google::protobuf::internal::WireFormatLite::ReadPackedPrimitiveNoInline<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, this->mutable_lista())));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(8)) goto parse_lista;
        if (input->ExpectAtEnd()) goto success;
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormat::SkipField(
              input, tag, mutable_unknown_fields()));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:bftbench.Estado)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:bftbench.Estado)
  return false;
#undef DO_
}

void Estado::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:bftbench.Estado)
  // repeated int32 lista = 1;
  for (int i = 0; i < this->lista_size(); i++) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(
      1, this->lista(i), output);
  }

  if (!unknown_fields().empty()) {
    ::google::protobuf::internal::WireFormat::SerializeUnknownFields(
        unknown_fields(), output);
  }
  // @@protoc_insertion_point(serialize_end:bftbench.Estado)
}

::google::protobuf::uint8* Estado::SerializeWithCachedSizesToArray(
    ::google::protobuf::uint8* target) const {
  // @@protoc_insertion_point(serialize_to_array_start:bftbench.Estado)
  // repeated int32 lista = 1;
  for (int i = 0; i < this->lista_size(); i++) {
    target = ::google::protobuf::internal::WireFormatLite::
      WriteInt32ToArray(1, this->lista(i), target);
  }

  if (!unknown_fields().empty()) {
    target = ::google::protobuf::internal::WireFormat::SerializeUnknownFieldsToArray(
        unknown_fields(), target);
  }
  // @@protoc_insertion_point(serialize_to_array_end:bftbench.Estado)
  return target;
}

int Estado::ByteSize() const {
  int total_size = 0;

  // repeated int32 lista = 1;
  {
    int data_size = 0;
    for (int i = 0; i < this->lista_size(); i++) {
      data_size += ::google::protobuf::internal::WireFormatLite::
        Int32Size(this->lista(i));
    }
    total_size += 1 * this->lista_size() + data_size;
  }

  if (!unknown_fields().empty()) {
    total_size +=
      ::google::protobuf::internal::WireFormat::ComputeUnknownFieldsSize(
        unknown_fields());
  }
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = total_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void Estado::MergeFrom(const ::google::protobuf::Message& from) {
  GOOGLE_CHECK_NE(&from, this);
  const Estado* source =
    ::google::protobuf::internal::dynamic_cast_if_available<const Estado*>(
      &from);
  if (source == NULL) {
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
    MergeFrom(*source);
  }
}

void Estado::MergeFrom(const Estado& from) {
  GOOGLE_CHECK_NE(&from, this);
  lista_.MergeFrom(from.lista_);
  mutable_unknown_fields()->MergeFrom(from.unknown_fields());
}

void Estado::CopyFrom(const ::google::protobuf::Message& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void Estado::CopyFrom(const Estado& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool Estado::IsInitialized() const {

  return true;
}

void Estado::Swap(Estado* other) {
  if (other != this) {
    lista_.Swap(&other->lista_);
    std::swap(_has_bits_[0], other->_has_bits_[0]);
    _unknown_fields_.Swap(&other->_unknown_fields_);
    std::swap(_cached_size_, other->_cached_size_);
  }
}

::google::protobuf::Metadata Estado::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = Estado_descriptor_;
  metadata.reflection = Estado_reflection_;
  return metadata;
}


// @@protoc_insertion_point(namespace_scope)

}  // namespace bftbench

// @@protoc_insertion_point(global_scope)