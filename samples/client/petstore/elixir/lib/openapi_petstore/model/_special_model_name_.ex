# NOTE: This file is auto generated by OpenAPI Generator 6.6.4-amadeus (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.SpecialModelName do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"$special[property.name]"
  ]

  @type t :: %__MODULE__{
    :"$special[property.name]" => integer() | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.SpecialModelName do
  def decode(value, _options) do
    value
  end
end

