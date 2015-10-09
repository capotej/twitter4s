package twitter4s.http.clients.followers.parameters

import twitter4s.http.marshalling.Parameters

case class FollowersParameters(user_id: Option[Long],
                               screen_name: Option[String],
                               cursor: Long,
                               count: Int,
                               skip_status: Boolean,
                               include_user_entities: Boolean) extends Parameters