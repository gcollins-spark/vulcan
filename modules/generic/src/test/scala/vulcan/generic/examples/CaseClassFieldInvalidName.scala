package vulcan.generic.examples

import vulcan.Codec
import vulcan.generic._

final case class CaseClassFieldInvalidName(`-value`: Int)

object CaseClassFieldInvalidName {
  implicit def codec: Codec[CaseClassFieldInvalidName] =
    Codec.derive
}
