# NOTE: This file is auto generated by OpenAPI Generator 6.6.4-amadeus (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.DogAllOf do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :breed
  ]

  @type t :: %__MODULE__{
    :breed => String.t | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.DogAllOf do
  def decode(value, _options) do
    value
  end
end

