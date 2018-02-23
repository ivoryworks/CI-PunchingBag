# github comment settings
github.dismiss_out_of_range_messages

# Warn when PR has no milestone
warn("A pull request must have a milestone set") if github.pr_json["milestone"].nil?

# Warn when PR has no assignees
warn("A pull request must have some assignees") if github.pr_json["assignee"].nil?

# Warn when there is a big PR
# warn("a large PR") if git.lines_of_code > 300
warn("変更行が多すぎます。プルリクエストの分割を検討してください。") if git.lines_of_code > 300

# Android lint
android_lint.gradle_task = "app:lint"
android_lint.report_file = "app/build/reports/lint-results.xml"
android_lint.filtering = true
android_lint.lint(inline_mode: true)
