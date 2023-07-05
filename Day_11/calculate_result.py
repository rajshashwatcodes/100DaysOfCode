def calculate_result(exam1, exam2, sports_event, activity1, activity2, activity3):
    # Constants for weightage
    exam_weightage = 0.5
    sports_weightage = 0.3
    activity_weightage = 0.2

    # Calculate weighted scores
    exam_avg = (exam1 + exam2) / 2
    sports_score = sports_event
    activity_avg = (activity1 + activity2 + activity3) / 3

    # Calculate final result
    final_result = (exam_avg * exam_weightage) + (sports_score * sports_weightage) + (activity_avg * activity_weightage)
    return final_result


# Example usage
exam1_score = 80
exam2_score = 85
sports_event_score = 90
activity1_score = 70
activity2_score = 75
activity3_score = 80

result = calculate_result(exam1_score, exam2_score, sports_event_score, activity1_score, activity2_score, activity3_score)
print("Final result: ", result)
