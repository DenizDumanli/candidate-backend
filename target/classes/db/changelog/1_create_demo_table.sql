-- public.candidate definition

-- Drop table

-- DROP TABLE public.candidate;

CREATE TABLE public.candidate (
                               id bigserial NOT NULL,
                               name varchar NOT NULL,
                               surname varchar NOT NULL,
                               email varchar NOT NULL,
                               notes varchar NOT NULL,
                               status varchar NOT NULL
);