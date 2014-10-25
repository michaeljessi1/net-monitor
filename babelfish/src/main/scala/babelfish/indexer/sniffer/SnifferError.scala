/*
 * Copyright (c) 2014 Landon Fuller <landon@landonf.org>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package babelfish.indexer.sniffer

/**
 * Sniffer error.
 */
sealed abstract class SnifferError (val message: String, val cause: Option[Throwable]) extends Exception

/**
 * All SniffError error types.
 */
object SnifferError {
  /**
   * The content type could not be determined.
   */
  object UnknownContent extends SnifferError("The content type could not determined", None)

  /**
   * An I/O error occurred.
   * @param message Error description.
   * @param cause Cause, if any.
   */
  case class IO (override val message: String, override val cause: Option[Throwable]) extends SnifferError (message, cause)

}