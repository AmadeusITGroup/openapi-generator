# NOTE: This file is auto generated by OpenAPI Generator 7.4.0-amadeus (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.SpecialModelName do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :"$special[property.name]"
  ]

  @type t :: %__MODULE__{
    :"$special[property.name]" => integer() | nil
  }

  def decode(value) do
    value
  end
end

