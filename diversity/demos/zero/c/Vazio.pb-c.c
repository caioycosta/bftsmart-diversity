/* Generated by the protocol buffer compiler.  DO NOT EDIT! */
/* Generated from: Vazio.proto */

/* Do not generate deprecated warnings for self */
#ifndef PROTOBUF_C__NO_DEPRECATED
#define PROTOBUF_C__NO_DEPRECATED
#endif

#include "Vazio.pb-c.h"
void   bftbench__vazio__init
                     (Bftbench__Vazio         *message)
{
  static Bftbench__Vazio init_value = BFTBENCH__VAZIO__INIT;
  *message = init_value;
}
size_t bftbench__vazio__get_packed_size
                     (const Bftbench__Vazio *message)
{
  assert(message->base.descriptor == &bftbench__vazio__descriptor);
  return protobuf_c_message_get_packed_size ((const ProtobufCMessage*)(message));
}
size_t bftbench__vazio__pack
                     (const Bftbench__Vazio *message,
                      uint8_t       *out)
{
  assert(message->base.descriptor == &bftbench__vazio__descriptor);
  return protobuf_c_message_pack ((const ProtobufCMessage*)message, out);
}
size_t bftbench__vazio__pack_to_buffer
                     (const Bftbench__Vazio *message,
                      ProtobufCBuffer *buffer)
{
  assert(message->base.descriptor == &bftbench__vazio__descriptor);
  return protobuf_c_message_pack_to_buffer ((const ProtobufCMessage*)message, buffer);
}
Bftbench__Vazio *
       bftbench__vazio__unpack
                     (ProtobufCAllocator  *allocator,
                      size_t               len,
                      const uint8_t       *data)
{
  return (Bftbench__Vazio *)
     protobuf_c_message_unpack (&bftbench__vazio__descriptor,
                                allocator, len, data);
}
void   bftbench__vazio__free_unpacked
                     (Bftbench__Vazio *message,
                      ProtobufCAllocator *allocator)
{
  assert(message->base.descriptor == &bftbench__vazio__descriptor);
  protobuf_c_message_free_unpacked ((ProtobufCMessage*)message, allocator);
}
#define bftbench__vazio__field_descriptors NULL
#define bftbench__vazio__field_indices_by_name NULL
#define bftbench__vazio__number_ranges NULL
const ProtobufCMessageDescriptor bftbench__vazio__descriptor =
{
  PROTOBUF_C__MESSAGE_DESCRIPTOR_MAGIC,
  "bftbench.Vazio",
  "Vazio",
  "Bftbench__Vazio",
  "bftbench",
  sizeof(Bftbench__Vazio),
  0,
  bftbench__vazio__field_descriptors,
  bftbench__vazio__field_indices_by_name,
  0,  bftbench__vazio__number_ranges,
  (ProtobufCMessageInit) bftbench__vazio__init,
  NULL,NULL,NULL    /* reserved[123] */
};