create table identifiable
(
    id serial primary key not null
);

create table programs
(
    name     text        not null,
    syllabus text,
    language varchar(50) not null,
    like identifiable including all
);

create table courses
(
    name     text not null,
    syllabus text,
    like identifiable including all
);

create table lectures
(
    name                     text not null,
    lecture_type_code        char not null,
    lecture_type_description text not null,
    course_description       text not null,
    teacher_names            text not null,
    like identifiable including all
);

create table students
(
    name          text not null,
    gender        text not null,
    addresses     text not null,
    number        text not null
        constraint uniq_student_number unique,
    mentor_id     text not null,
    date_of_birth date not null,
    constraint uniq_student_name_birth unique (name, date_of_birth),
    like identifiable including all
);

create table program_courses
(
    program_id int not null references programs (id),
    course_id  int not null references courses (id),
    constraint pk_program_courses primary key (program_id, course_id)
);

create table course_lectures
(
    course_id  int not null references courses (id),
    lecture_id int not null references lectures (id),
    ordinal    int not null,
    constraint pk_course_lectures primary key (course_id, lecture_id),
    constraint uniq_lecture_course_ordinal unique (course_id, ordinal)
);

create table course_prerequisites
(
    course_id          int not null references courses (id),
    required_course_id int not null references courses (id),
    constraint pk_course_prerequisites primary key (course_id, required_course_id)
);

create table student_course_enrolls
(
    student_id          int  not null references students (id),
    course_id           int  not null references courses (id),
    enrollment_date     date not null,
    finished_date       date,
    exercises_correct   int,
    exercises_incorrect int,
    exercises_score     int generated always as (exercises_correct - exercises_incorrect) stored,
    constraint pk_student_course_enrolls primary key (student_id, course_id)
);

create table student_lecture_attends
(
    student_id      int  not null references students (id),
    lecture_id      int  not null references lectures (id),
    attendance_date date not null,
    constraint pk_student_lecture_attends primary key (student_id, lecture_id)
);
