package de.wolffclan.teacher;

import lombok.Builder;
import lombok.Data;

@Builder
public record Teacher(int id, String name, String subject) {
}
