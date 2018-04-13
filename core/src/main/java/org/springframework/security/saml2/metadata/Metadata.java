/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml2.metadata;

import org.springframework.security.saml2.Saml2Object;

/**
 * Represents metadata for a
 * <li>
 *     <ul>SSO Service Provider</ul>
 *     <ul>SSO Identity Provider</ul>
 * </li>
 * Currently does <b>not support</b> metadata for
 * <li>
 *     <ul>Authentication Authority</ul>
 *     <ul>Attribute Authority</ul>
 *     <ul>Policy Decision Point</ul>
 *     <ul>Affiliation</ul>
 * </li>
 */
public interface Metadata extends Saml2Object {

}