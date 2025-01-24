interface UserProps {
    user: UserDTO;
}

export function User({user}: UserProps) {
    return (
        <div>
            "Hi!"
            <div>{user.email}</div>
            {user.dateOfBirth && <div>{user.dateOfBirth}</div>}
        </div>
    )
}

export interface UserDTO {
    id: string;
    email: string;
    dateOfBirth?: string;
}