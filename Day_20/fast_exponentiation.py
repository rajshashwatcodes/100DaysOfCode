def fast_exponentiation(base, exponent, modulus=None):
  """Computes the power of a base raised to an exponent, modulo a modulus if provided.

  Args:
    base: The base.
    exponent: The exponent.
    modulus: The modulus, or None if no modulus is used.

  Returns:
    The power of the base raised to the exponent, modulo the modulus if provided.
  """

  if modulus is None:
    # If no modulus is provided, simply compute the power.
    power = base ** exponent
    return power

  # If a modulus is provided, use binary exponentiation to compute the power modulo the modulus.
  result = 1
  while exponent > 0:
    if exponent & 1:
      result = (result * base) % modulus
    base = (base * base) % modulus
    exponent >>= 1
  return result
