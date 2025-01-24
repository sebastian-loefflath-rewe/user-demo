import './User.css';

interface UserProps {
    user: UserDTO;
}

export function User({user}: UserProps) {
    return (
        <div className="user">
            User
            <div className="email">{user.email}</div>
            {user.dateOfBirth && <Dob dateOfBirth={user.dateOfBirth} />}
        </div>
    )
}

function Dob({dateOfBirth}: {dateOfBirth: string}) {
    const formatted = Intl.DateTimeFormat('de-DE', {year: 'numeric', month: 'long', day: 'numeric'}).format(new Date(dateOfBirth));
    return (
        <time dateTime={dateOfBirth}>{formatted}</time>
    )
}

export interface UserDTO {
    id: string;
    email: string;
    dateOfBirth?: string;
}