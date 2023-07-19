# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.MixedPropertiesAndAdditionalPropertiesClass do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :uuid,
    :dateTime,
    :map
  ]

  @type t :: %__MODULE__{
    :uuid => String.t | nil,
    :dateTime => DateTime.t | nil,
    :map => %{optional(String.t) => OpenapiPetstore.Model.Animal.t} | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.MixedPropertiesAndAdditionalPropertiesClass do
  import OpenapiPetstore.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:map, :map, OpenapiPetstore.Model.Animal, options)
  end
end

