# github comment settings
github.dismiss_out_of_range_messages

# Warn when PR has no milestone
warn("A pull request must have a milestone set") if github.pr_json["milestone"].nil?

# Warn when PR has no assignees
warn("A pull request must have some assignees") if github.pr_json["assignee"].nil?
