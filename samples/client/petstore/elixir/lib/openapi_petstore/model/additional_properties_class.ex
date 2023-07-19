# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.AdditionalPropertiesClass do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :map_property,
    :map_of_map_property
  ]

  @type t :: %__MODULE__{
    :map_property => %{optional(String.t) => String.t} | nil,
    :map_of_map_property => %{optional(String.t) => %{optional(String.t) => String.t}} | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.AdditionalPropertiesClass do
  def decode(value, _options) do
    value
  end
end

