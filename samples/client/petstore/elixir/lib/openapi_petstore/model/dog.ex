# NOTE: This file is auto generated by OpenAPI Generator 7.4.0-amadeus (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.Dog do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :className,
    :color,
    :breed
  ]

  @type t :: %__MODULE__{
    :className => String.t,
    :color => String.t | nil,
    :breed => String.t | nil
  }

  def decode(value) do
    value
  end
end

